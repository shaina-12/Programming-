# include <iostream>
# include <fstream>
using namespace std;
class Student{
    char name[80];
    int rollno;
    float gpa;
    public:
    void get(){
        cin>>name;
        cin>>rollno;
        cin>>gpa;
    }
    void show(){
        cout<<name<<" "<<rollno<<" "<<gpa<<endl;
    }
};
void showdata(){
    fstream fin;
    Student s;
    fin.open("input.dat",ios::in|ios::binary);
    //int a = fin.tellg();
    //cout<<a<<endl;
    fin.read(reinterpret_cast<char*>(&s),sizeof(s));
    while(!fin.eof()){
        s.show();
        fin.read(reinterpret_cast<char*>(&s),sizeof(s));
    }
    fin.close();
}
void getdata(){
    Student s;
    fstream fout;
    fout.open("input.dat",ios::app|ios::binary);
    s.get();
    fout.write(reinterpret_cast<char*>(&s),sizeof(s));
    fout.close();
}
int main(){
    getdata();
    showdata();
    return 0;
}