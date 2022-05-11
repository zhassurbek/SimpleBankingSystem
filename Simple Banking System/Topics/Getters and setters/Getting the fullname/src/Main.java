
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (java.util.Objects.equals(this.firstName, "") || this.firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (java.util.Objects.equals(this.lastName, "") || this.lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (java.util.Objects.equals(this.firstName, ""))
            System.out.println(firstName);
        else if (java.util.Objects.equals(this.lastName, ""))
            return lastName;
        return firstName + "" + lastName; // write your code here
    }
}