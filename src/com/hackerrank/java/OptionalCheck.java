package com.hackerrank.java;

import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //Optional<Employee> optional= Optional.ofNullable(employee);
        //String result=optional.flatMap()
        String result =Optional.ofNullable(employee).flatMap(employee1 -> Optional.ofNullable(employee1.getAddress()))
                .flatMap(address -> Optional.ofNullable(address.getNationality()))
                .flatMap(nationality -> Optional.ofNullable(nationality.getCountry()))
                .map(country -> country.getCountryCode().trim()).orElse(null);
                //.map(country -> Optional.ofNullable(country.getCountryCode())).orElse(null);
        System.out.println(result);
        Address address=new Address();
        Nationality nationality =new Nationality();
        Country  country=new Country();
        //country.setCountryCode("IND");
        country.setCountryName("INDIA");
        nationality.setCountry(country);
        address.setNationality(nationality);
        employee.setAddress(address);

        result = Optional.ofNullable(employee).flatMap(employee1 -> Optional.ofNullable(employee1.getAddress()))
                .flatMap(address1 -> Optional.ofNullable(address1.getNationality()))
                .flatMap(nationality1 -> Optional.ofNullable(nationality1.getCountry()))
                .map(country1 -> country1.getCountryName().trim()).orElse(null);
        System.out.println(result);

        result = Optional.ofNullable(employee).map(employee1 -> employee1.getAddress()).map(Address::getNationality)
                .map(Nationality::getCountry).map(countryVal-> countryVal.getCountryCode()).map(cntr->cntr.trim()).orElse(null);
        System.out.println( result);

    }
}

class Employee{
    private Address address;
    private Optional<Address> optionalAddress;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Optional<Address> getOptionalAddress() {
        return optionalAddress;
    }

    public void setOptionalAddress(Optional<Address> optionalAddress) {
        this.optionalAddress = optionalAddress;
    }
}

class Address{
    private Nationality nationality;
    private Optional<Nationality> optionalNationality;
    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Optional<Nationality> getOptionalNationality() {
        return optionalNationality;
    }

    public void setOptionalNationality(Optional<Nationality> optionalNationality) {
        this.optionalNationality = optionalNationality;
    }
}

class Nationality{
    private Country country;
    private Optional<Country> optionalCountry;
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Optional<Country> getOptionalCountry() {
        return optionalCountry;
    }

    public void setOptionalCountry(Optional<Country> optionalCountry) {
        this.optionalCountry = optionalCountry;
    }
}

class Country{
    private String countryName;
    private String countryCode;
    private Optional<String> optionalString;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Optional<String> getOptionalString() {
        return optionalString;
    }

    public void setOptionalString(Optional<String> optionalString) {
        this.optionalString = optionalString;
    }
}
