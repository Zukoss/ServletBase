package models;

public class AppUser {
    private Long id;
    private String login;
    private String name;
    private String lastName;
    private String email;

    public AppUser() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static class AppUserBuilder {
        private Long id;
        private String login;
        private String name;
        private String lastName;
        private String email;

        public static AppUserBuilder getBuilder() {
            return new AppUserBuilder();
        }

        public AppUserBuilder id(Long id) {
            this.id = id;
            return this;
        }
        public AppUserBuilder login(String login) {
            this.login = login;
            return this;
        }
        public AppUserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public AppUserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public AppUserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public AppUser build() {
            AppUser appUser = new AppUser();
            appUser.setId(this.id);
            appUser.setLogin(this.login);
            appUser.setName(this.name);
            appUser.setLastName(this.lastName);
            appUser.setEmail(this.email);
            return appUser;
        }
    }
}
