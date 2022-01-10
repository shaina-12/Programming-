# include <iostream>
# include <fstream>
# include <string>
using namespace std;
int main(){
    fstream fout;
    string line;
    fout.open("Sample.txt",ios::out);
    while(fout){
        // reading a line from standard input
        getline(cin,line);
        if(line == "-1"){
            break;
        }
        // writing a line in the file
        fout<< line << endl;
    }
    fout.close();
}