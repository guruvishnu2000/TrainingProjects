package assessment1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class phase1project {
	static String DIRECTORY;
    File files;

    public phase1project() {
        DIRECTORY = System.getProperty("user.dir");
        files = new File(DIRECTORY+"/files");
        if (!files.exists())
            files.mkdirs();
        System.out.println("DIRECTORY :"+ files.getAbsolutePath());
    }

    private static final String WELCOME_MESSAGE =
            "\nVirtual Key for Your Repositories"+
                    "\nDEVELOPER:GURUVISHNU S\n";

    private static final String MAIN_MENU =
            "\nMAIN MENU - Enter your choice: \n"+
                    "1 -> List all files\n"+
                    "2 -> Add, Delete or Search\n"+
                    "3 -> Exit Program";

    private static final String SECONDARY_MENU =
            "   \nSelect your choice: \n"+
                    "   a -> Add a file\n"+
                    "   b -> Delete a file\n"+
                    "   c -> Search a file\n"+
                    "   d -> Go Back to main menu";

    void showPrimaryMenu() {
        System.out.println(MAIN_MENU);
        try{
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice){
                case 1 : {
                    showFiles();
                    showPrimaryMenu();
                }
                case 2 : {
                    showSecondaryMenu();
                }
                case 3 : {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default: showPrimaryMenu();
            }
        }
        catch (Exception e){
            System.out.println("Your choice not Found.Please enter 1, 2 or 3");
            showPrimaryMenu();
        }
    }

    void showSecondaryMenu() {
        System.out.println(SECONDARY_MENU);
        try{
            Scanner in = new Scanner(System.in);
            char[] input =in.nextLine().toLowerCase().trim().toCharArray();
            char option = input[0];

            switch (option){
                case 'a' : {
                    System.out.print("Adding a file..Enter a File Name : ");
                    String filename = in.next().trim().toLowerCase();
                    addFile(filename);
                    break;
                }
                case 'b' : {
                    System.out.print("Deleting a file..Enter a File Name : ");
                    String filename = in.next().trim();
                    deleteFile(filename);
                    break;
                }
                case 'c' : {
                    System.out.print("Searching a file..Enter a File Name : ");
                    String filename = in.next().trim();
                    searchFile(filename);
                    break;
                }
                case 'd' : {
                    System.out.println("Going Back to Main menu");
                    showPrimaryMenu();
                    break;
                }
                default : System.out.println("Your choice not found.Please enter a, b, c, d");
            }
            showSecondaryMenu();
        }
        catch (Exception e){
            System.out.println("Your choice not found.Please enter a, b, c, d");
            showSecondaryMenu();
        }
    }

    void showFiles() {
        if (files.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = files.list();
            System.out.println("The files in "+ files +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }

    void addFile(String File_name) throws IOException {
        File filepath = new File(files +"/"+File_name);
        String[] list = files.list();
        for (String file: list) {
            if (File_name.equalsIgnoreCase(file)) {
                System.out.println("File " +File_name + " already exists at " + files);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+File_name+" added to "+ files);
    }

    void deleteFile(String File_name) {
        File filepath = new File(files +"/"+File_name);
        String[] list = files.list();
        for (String file: list) {
            if (File_name.equals(file)) {
            	filepath.delete();
                System.out.println("File " + File_name + " deleted from " + files);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    void searchFile(String File_name) {
        String[] list = files.list();
        for (String file: list) {
            if (File_name.equals(file)) {
                System.out.println("FOUND : File " + File_name + " exists at " + files);
                return;
            }
        }
        System.out.println("FNF-File NOT Found");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WELCOME_MESSAGE);
        phase1project o = new phase1project();
        o.showPrimaryMenu();

	}

}