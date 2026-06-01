class Person {
    @SerializedName("first_name")
    String firstName;  // GSON mappt "first_name" → firstName

    @SerializedName("user_age")
    int age;
}