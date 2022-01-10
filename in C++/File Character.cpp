# include <iostream>
# include <fstream>
# include <string>
using namespace std;
void reading(){
    fstream f;
    char ch;
    f.open("myfile.txt",ios::in);
    while(!f.eof()){
        f.get(ch);
        cout<<ch;
    }
    f.close();
}
void writing(){
    fstream f;
    string str = "my name is shaina mehta.";
    f.open("myfile.txt",ios::app);
    for(int i=0;i<str.length();i++){
        f.put(str[i]);
    }
    f.close();
}
int main(){
    writing();
    reading();
    return 0;
}