public class Author {
    protected   String name;//protected variables to be extended
    protected String email;
    protected String birthDate;



    public Author(String name, String email, String birthDate) {//author constructor
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

    }
    public String getName()//getter for name
    {
        return name;
    }
    public String getEmail() {//getter for name
        return email;
    }
    public String getBirthDate() {//getter birth date
        return birthDate;
    }

    public void setName(String name) {//setter for name
        this.name = name;
    }
    public void setEmail(String email) {//setter email
        this.email = email;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.name + "" + this.email + ", born " + this.birthDate;
    }
}
