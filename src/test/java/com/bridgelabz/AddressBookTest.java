package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

import static com.bridgelabz.AddressBook.IOService.FILE_IO;

public class AddressBookTest {
    @Test
    public void givenContactDetails() {
        Contact[] array = {
                new Contact("A", "Sr", "Atp", "Atp", "Ap", 152649, 896515701, "8919584625"),
                new Contact("A", "J", "M", "M", "M", 526341, 962574165, "9059463010"),
        };
        AddressBook addressBook;
        addressBook = new AddressBook(Arrays.asList(array));
        addressBook.writeTheData(FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBook addressBook = new AddressBook();
        addressBook.readContactDetails(FILE_IO);
    }
}
