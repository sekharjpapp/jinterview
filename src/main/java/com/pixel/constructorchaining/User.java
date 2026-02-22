package com.pixel.constructorchaining;

public record User(
        String id,
        String name,
        String email,
        String phone,
        String address,
        boolean active
) {

    // Canonical constructor validation
    public User {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id is mandatory");
        }
    }

    // Entry point
    public static Builder builder() {
        return new Builder();
    }

    // Builder class
    public static class Builder {
        private String id;
        private String name = "Unknown";
        private String email;
        private String phone;
        private String address;
        private boolean active = true;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            return new User(id, name, email, phone, address, active);
        }
    }
}

