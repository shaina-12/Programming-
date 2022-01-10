# include <iostream>
# include <fstream>
using namespace std;
int main(){
    fstream fin;
    fin.open("Sample.txt");
    string line;
    while(!fin.eof()){
        // reading a line from the file
        getline(fin,line);
        // writing it in the console
        cout<<line<<endl;
    }
    fin.close();
}