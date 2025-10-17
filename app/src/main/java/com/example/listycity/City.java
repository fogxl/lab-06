package com.example.listycity;

/**
 * This class defines a City object that stores information about a city and its corresponding province.
 */
public class City implements Comparable<City> {

    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province that the city belongs to.
     */
    private String province;

    /**
     * Constructs a new City with the specified province and city names.
     *
     * @param province The name of the province.
     * @param city The name of the city.
     */
    public City(String city, String province) {
        this.province = province;
        this.city = city;
    }

    /**
     * Returns the name of the city.
     *
     * @return The name of the city.
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Updates the name of the city.
     *
     * @param city The new name of the city.
     */
    public void setCityName(String city) {
        this.city = city;
    }

    /**
     * Returns the name of the province.
     *
     * @return The name of the province.
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Updates the name of the province.
     *
     * @param province The new name of the province.
     */
    public void setProvinceName(String province) {
        this.province = province;
    }

    /**
     * Compares this City object to another City object based on their city names.
     * The comparison is lexicographical (alphabetical order).
     *
     * @param o The object to compare to.
     * @return A negative integer, zero, or a positive integer as this city's name
     *         is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Determines whether this City is equal to another object.
     * Two City objects are considered equal if they have the same
     * city name and province name.
     *
     * @param obj The object to compare with this City.
     * @return {@code true} if the specified object is a City with the same
     *         city and province names; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City other = (City) obj;
        return this.city.equals(other.city)
                && this.province.equals(other.province);
    }

    /**
     * Returns a hash code value for this City.
     * The hash code is computed based on the city and province names,
     * ensuring that equal City objects produce the same hash code.
     *
     * @return An integer hash code value for this City.
     */
    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }
}