package com.kruczala.michal.Statistic.Repository;

import com.kruczala.michal.advancecalculator.statistic.RepositoryApplication;
import com.kruczala.michal.exceptions.NoRepositoryException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
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
    private void prepareEmptyRepository() {
        File file = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        file.createNewFile();

    }


    @Test
    public void fifteenRepositoryTest() throws IOException {
        prepareFifteenRepository();

        RepositoryApplication repositoryApplication = new RepositoryApplication();
        String repositoryResult = repositoryApplication.searchAll();
        Assertions.assertEquals(repositoryResult.length(), 15);
    }
    private void prepareFifteenRepository() throws IOException {  //file.createNewFile();
        File repositoryResult = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");

        FileWriter fw = new FileWriter(repositoryResult);
        Formatter fm = new Formatter(fw);

        for (int i = 1; i < 16; i++) {
            fm.format("%s", 1);
        }
        fm.close();
        fw.close();
        repositoryResult.deleteOnExit();

    }
    @Test
    public void readFromEmptyRepository() throws IOException {
        RepositoryApplication repositoryApplication = new RepositoryApplication();
        String repositoryResult = repositoryApplication.searchAll();
        File plik = new File("D://Repositories/RepositoryAdvanceCalculator.mkr");
        Scanner read = new Scanner("D://Repositories/RepositoryAdvanceCalculator.mkr");
        String text = read.nextLine();
        Assertions.assertEquals(text,repositoryResult);
        plik.deleteOnExit();

    }


}