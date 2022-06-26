package com.kruczala.michal.Statistic.Repository;

import com.kruczala.michal.advancecalculator.statistic.RepositoryApplication;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryTest {
    @Test
    public void noRepositoryTest() {
        // prepare repository
        // run application - statistic module
        Assertions.assertThrows(NoSuchFileException.class, () -> {
            RepositoryApplication repositoryApplication = new RepositoryApplication();
            repositoryApplication.searchAll();
        });
        // check data
        // clean repository
    }

    @Test
    public void emptyRepositoryTest() throws IOException {
        prepareEmptyRepository();
        RepositoryApplication repositoryApplication = new RepositoryApplication();
        String repositoryResult = repositoryApplication.searchAll();
        Assertions.assertTrue(repositoryResult.isEmpty());
        deleteRepository();
    }

    private void deleteRepository() {
        File file1 = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        file1.delete();
    }

    @SneakyThrows
    private File prepareEmptyRepository() {
        File file = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        file.createNewFile();
        return file;

    }


    @Test
    public void fifteenRepositoryTest() throws IOException {
        prepareFifteenRepository();

        RepositoryApplication repositoryApplication = new RepositoryApplication();
        ArrayList<Object> repositoryResult = repositoryApplication.searchAll();
        Assertions.assertEquals(repositoryResult.size(), prepareFifteenRepository());
    }

    private File prepareFifteenRepository() throws IOException {
        File file = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        file.createNewFile();

        HistoryEntryTest history1 = new HistoryEntryTest("2022-06-24", 6, 7, 42);
        ArrayList<HistoryEntryTest> List = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            List.add(history1);
        }

        FileWriter fw = new FileWriter(file);
        fw.write(String.valueOf(List));
        fw.close();
        return file;
    }

    @Test
    public void CleanRepository() throws IOException {

        File file = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        file.createNewFile();

        ArrayList<HistoryEntryTest> List = new ArrayList<>();
        HistoryEntryTest history1 = new HistoryEntryTest("2022-06-24", 6, 7, 42);


        List.add(history1);
        List.remove(history1);

        FileWriter fw = new FileWriter(file);
        fw.write(List.toString());
        fw.close();

        RepositoryApplication repositoryApplication = new RepositoryApplication();
        String repositoryResult = repositoryApplication.searchAll();
       Assertions.assertEquals(repositoryResult,file);


    }

    @Test
    public void readFromEmptyRepository() throws IOException {
        RepositoryApplication repositoryApplication = new RepositoryApplication();
        String repositoryResult = repositoryApplication.searchAll();
        prepareEmptyRepository();
        Scanner read = new Scanner(prepareEmptyRepository());
        String text = read.nextLine();
        Assertions.assertEquals(text, repositoryResult);

    }


}