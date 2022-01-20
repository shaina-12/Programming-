# include <iostream>
# include <fstream>
# include <string>
using namespace std;
int main(){
    fstream file,file1;
    string word,filename,filename1;
    filename = "Data.txt";
    filename1 = "data1.txt";
    file.open(filename.c_str(),ios::in);
    file1.open(filename1,ios::out);
    while(file>>word){
        string str = word;
        file1<<str<<endl;
    }
    file.close();
    file1.close();
}