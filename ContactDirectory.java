import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private Contact next;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact getNext() {
        return next;
    }

    public void setNext(Contact next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactDirectory {
    private Contact head;

    public ContactDirectory() {
        head = null;
    }

    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (head == null) {
            head = newContact;
        } else {
            Contact lastContact = head;
            while (lastContact.getNext() != null) {
                lastContact = lastContact.getNext();
            }
            lastContact.setNext(newContact);
        }
        System.out.println("Contact added successfully.");
    }

    public Contact searchContact(String name) {
        Contact currentContact = head;
        while (currentContact != null) {
            if (currentContact.getName().equalsIgnoreCase(name)) {
                return currentContact;
            }
            currentContact = currentContact.getNext();
        }
        return null; // Contact not found
    }

    public void displayAllContacts() {
        if (head == null) {
            System.out.println("Contact directory is empty.");
        } else {
            System.out.println("Contacts:");
            Contact currentContact = head;
            while (currentContact != null) {
                System.out.println(currentContact);
                currentContact = currentContact.getNext();
            }
        }
    }

    public void removeContact(String name) {
        if (head == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (head.getName().equalsIgnoreCase(name)) {
            head = head.getNext();
            System.out.println("Contact removed successfully.");
            return;
        }

        Contact prevContact = head;
        Contact currentContact = head.getNext();
        while (currentContact != null) {
            if (currentContact.getName().equalsIgnoreCase(name)) {
                prevContact.setNext(currentContact.getNext());
                System.out.println("Contact removed successfully.");
                return;
            }
            prevContact = currentContact;
            currentContact = currentContact.getNext();
        }

        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        ContactDirectory directory = new ContactDirectory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Contact Directory =====");
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Display all contacts");
            System.out.println("4. Remove contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    directory.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter the name to search: ");
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    String searchName = scanner.nextLine();
                    Contact result = directory.searchContact(searchName);
                    if (result != null) {
                        System.out.println("Contact found: " + result);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    directory.displayAllContacts();
                    break;
                case 4:
                    System.out.print("Enter the name to remove: ");
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    String removeName = scanner.nextLine();
                    directory.removeContact(removeName);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
