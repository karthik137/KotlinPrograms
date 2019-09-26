package utilities

fun checkUserStatus(): String {
    return "online"
}
// Extension function

fun String.upperCaseFirstLetter(): String {
    return this.substring(0,1).toUpperCase().plus(this.substring(1))
}