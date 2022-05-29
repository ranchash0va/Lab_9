package com.company;

/**
 * "id": "madtree-brewing-cincinnati",
 *     "name": "MadTree Brewing",
 *     "brewery_type": "regional",
 *     "street": "3301 Madison Rd",
 *     "address_2": null,
 *     "address_3": null,
 *     "city": "Cincinnati",
 *     "state": "Ohio",
 *     "county_province": null,
 *     "postal_code": "45209-1132",
 *     "country": "United States",
 *     "longitude": "-84.4239715",
 *     "latitude": "39.1563725",
 *     "phone": "5138368733",
 *     "website_url": "http://www.madtreebrewing.com",
 *     "updated_at": "2021-10-23T02:24:55.243Z",
 *     "created_at": "2021-10-23T02:24:55.243Z"
 */
public class ID {
private String id;
private  String name;
    private  String brewery_type;
    private  String street;
    private  String address_2;
    private  String address_3;
    private  String city;
    private  String state;
    private  String county_province;
    private String postal_code;
    private  String country;
    private float longitude;
    private float latitude;
    private String phone;
    private  String website_url;
    private String updated_at;
    private String created_at;

    public ID() {
    }

    public ID(String id, String name, String brewery_type, String street, String address_2, String address_3, String city, String state,
              String county_province, String postal_code, String country, float longitude, float latitude, String phone,
              String website_url, String updated_at, String created_at) {
        this.id = id;
        this.name = name;
        this.brewery_type = brewery_type;
        this.street = street;
        this.address_2 = address_2;
        this.address_3 = address_3;
        this.city = city;
        this.state = state;
        this.county_province = county_province;
        this.postal_code = postal_code;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.website_url = website_url;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    public String getBrewery_type() {
        return brewery_type;
    }

    public void setBrewery_type(String brewery_type) {
        this.brewery_type = brewery_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getAddress_3() {
        return address_3;
    }

    public void setAddress_3(String address_3) {
        this.address_3 = address_3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty_province() {
        return county_province;
    }

    public void setCounty_province(String county_province) {
        this.county_province = county_province;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID{" +
                "id ->'" + id
                + "\n"+
                " name ->'" + name
                + "\n"+
                " brewery_type ->"+brewery_type
                + "\n"+
                " street ->'" + street
                + "\n"+
                " address_2 ->'" + address_2
                + "\n"+
                " address_3 ->'" + address_3
                + "\n"+
                " city ->" + city
                + "\n"+
                " state ->" + state
                + "\n"+
                " county_province ->" + county_province
                + "\n"+
                " postal_code ->" + postal_code
                + "\n"+
                " country ->" + country
                + "\n"+
                " longitude ->" + longitude
                + "\n"+
                " latitude ->" + latitude
                + "\n"+
                " phone ->" + phone
                + "\n"+
                " website_url ->" + website_url
                + "\n"+
                " updated_at ->" + updated_at
                + "\n"+
                " created_at ->" + created_at
                + "\n"+
                '}';
    }
}


