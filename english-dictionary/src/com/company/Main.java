package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operationNumber;
        String treeType;
        String insertedWord;
        String deletedWord;
        String searchedWord;
        String filePath;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Insert type of backend tree supporting the dictionary (AVL - RedBlack) : ");
            treeType = scanner.next();
            if(treeType.equals("AVL") || treeType.equals("RedBlack")) break;
            else System.out.println("Invalid type");
        }
	    EnglishDict dictionary = new EnglishDict(treeType);
        while(true) {
            System.out.println("\n[1-insert, 2-delete, 3-search, 4-batch insert, 5-batch delete, 6-size, 7-height, 8-exit]");
            System.out.print("Insert operaton number you want to perform: ");
            operationNumber = scanner.nextInt();
            if(operationNumber == 8) break;
            switch (operationNumber) {
                case 1:
                    System.out.print("Word to be inserted: ");
                    insertedWord = scanner.next();
                    if (dictionary.insert(insertedWord)) {
                        System.out.printf("\"%s\" is added\n", insertedWord);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    System.out.print("Word to be deleted: ");
                    deletedWord = scanner.next();
                    if (dictionary.delete(deletedWord)) {
                        System.out.printf("\"%s\" is deleted\n", deletedWord);
                    } else {
                        System.out.println("word doesn't exist");
                    }
                    break;
                case 3:
                    System.out.print("Word to be searched: ");
                    searchedWord = scanner.next();
                    if (dictionary.search(searchedWord)) {
                        System.out.printf("\"%s\" word exists\n", searchedWord);
                    } else {
                        System.out.printf("\"%s\" word doesn't exist\n", searchedWord);
                    }
                    break;
                case 4:
                    System.out.print("directory of file of words to be inserted: ");
                    filePath = scanner.next();
                    int numberOfAddedWords = dictionary.batchInsert(filePath);
                    System.out.printf("%d words were inserted\n", numberOfAddedWords);
                    break;
                case 5:
                    System.out.print("directory of file of words to be deleted: ");
                    filePath = scanner.next();
                    int numberOfDeletedWords = dictionary.batchDelete(filePath);
                    System.out.printf("%d words were deleted\n", numberOfDeletedWords);
                    break;
                case 6:
                    int dictionarySize = dictionary.size();
                    System.out.printf("\"%d\" is the number of words in the dictionary\n", dictionarySize);
                    break;
                case 7:
                    int dictionaryHeight = dictionary.height();
                    System.out.printf("\"%d\" is the height of the dictionary\n", dictionaryHeight);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }

//        System.out.println(dictionary.insert("apple"));
//        System.out.println(dictionary.insert("bee"));
//        System.out.println(dictionary.search("bee"));
//        System.out.println(dictionary.size());
//        System.out.println(dictionary.height());
//        System.out.println(dictionary.delete("apple"));
//        System.out.println(dictionary.size());
//        System.out.println(dictionary.delete("bee"));
//        System.out.println(dictionary.size());
    }
}
