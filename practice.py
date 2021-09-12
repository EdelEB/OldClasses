
class Section:
    def __init__(self,sec_id):
        self.section_id=sec_id;
        self.enrolled_students=[];
    def enroll(self, name):
        self.enrolled_students.append(name);
    def is_enrolled(self, name):
        if(name in self.enrolled_students):
            return True;
        else:
            return False;
    
course = Section("Math111_101");
course.enroll("Joe Josephson");
course.enroll("Mary Smith");
print(course.is_enrolled("Mary Josephson"));
print(course.is_enrolled("Mary Smith"));
