#include<bits/stdc++.h>
#define eLine std::endl
bool ifLowerCase(std::string password){ // 97 - 122
    bool answer = false;
    char lowerCase[26];
    for(int i = 97; i <= 122; i++){
            lowerCase[i-97] = i;
    }
    for(auto &s: lowerCase){
        size_t found = password.find(s);
        if(found != std::string::npos){
            answer = true;
        }
    }
    return answer;
}
bool ifUpperCase(std::string password){ // 65 - 90
    bool answer = false;
    char upperCase[26];     // 65 - 90 UPPER
    for(int i = 65; i <= 90; i++){
            upperCase[i-65] = i;
    }
    for(auto &s: upperCase){
        size_t found = password.find(s);
        if(found != std::string::npos){
            answer = true;
        }
    }
    return answer;
}
bool ifSpecialCharacter(std::string password){
    char specialCharacters[12] = {'!','@','#','$','%','^','&','*','(',')','-','+'};
    bool answer = false;
    size_t found;
    for(auto &c: specialCharacters){
        found = password.find(c);
        if(found != std::string::npos){
            answer = true;
        }  
    }
    return answer;
}
bool ifNumberCharacter(std::string password){
    char numbers[10] = {'0', '1', '2', '3', '4', '5', '6'
                        , '7', '8', '9'};
    bool answer = false;
    for(auto &c: numbers){
        size_t found = password.find(c);
        if(found != std::string::npos){
            answer = true;
            break;
        }
    }
    return answer;
}
int16_t strongEnough(std::string password){    
    
    ////////////////////////////
    bool isLowerPresent = ifLowerCase(password);
    bool isUpperPresent = ifUpperCase(password);
    bool isSpecialPresent = ifSpecialCharacter(password);
    bool isNumbersPresent = ifNumberCharacter(password);
    int16_t minimumCharatersRequired = 0;

    if(!isLowerPresent) minimumCharatersRequired++;
    if(!isUpperPresent) minimumCharatersRequired++;
    if(!isSpecialPresent) minimumCharatersRequired++;
    if(!isNumbersPresent) minimumCharatersRequired++;

    if(password.size() < 6){
        if(password.size() + minimumCharatersRequired < 6){
            minimumCharatersRequired = 6 - password.size();
        }
    }
    
    return minimumCharatersRequired;
} 
int main(void){
    int n = 0;
    std::cin>>n;
    std::string password = "";
    std::getline(std::cin>>std::ws, password);
    int requiredCharatersToAdd = strongEnough(password);
    std::cout<<requiredCharatersToAdd;
    return 0;
}