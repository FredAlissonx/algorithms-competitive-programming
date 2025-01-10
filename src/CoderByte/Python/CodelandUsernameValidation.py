def CodelandUsernameValidation(strParam):
    if len(strParam) not in range(4, 26):
        return "false"
    
    if not strParam[0].isalpha() or strParam.endswith("_"):
        return "false"
    
    if not all(char.isalnum() or char == "_" for char in strParam):
        return "false"
    
    return "true"