# import psycopd2 as db
# from psycopg2.extras import DictCursor
# from contextlib import closing

# query = "select * from passenger;"

# with closing(db.connect(host='localhost', port=5432, user='postgres',
#                         password='1234', dbname='postgres')) as conn:
#     with conn.cursor(cursor_factory=DictCursor) as cursor:
#         cursor.execute(query)
#         res = cursor.fetchone()

# create, update, delete
# conn.commit

class Fruit:
    count = 0 # static
    def __init__(self, name= 'noname', weight = 0):
        self.name = name
        self.weight = weight
        Fruit.count += 1

    def get_name(self):
        return self.name

    def set_name(self, newname):
        self.name = newname

    @staticmethod
    def get_count():
        return Fruit.count

mango = Fruit('Манго', 120)
apple = Fruit('Яблоко', 150)
lemon = Fruit()

mango.set_name('маНГО2')
print(mango.get_name())




# ИНКАПСУЛЯЦИЯ
# НАСЛЕДОВАНИЕ - 1. base, parents, super 2. производный, дочерний(derived)
# ПОЛИМОРФИЗМ

def shape_info(shape):
    print(f'Figure - {shape.name}. Area= {shape.area()}, Perimetr = {shape.perimetr()}')

class Circle:
    def __init__(self, radius):
        self.radius = radius
        self.name = 'circle'


    def area(self):
        return self.radius * 3,14 ** 2

    def perimetr(self):
        return self.radius * 3,14 * 2

class Rectangle:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        self.name = 'rect'

    def area(self):
        return self.a * self.b

    def perimetr(self):
        return (self.a + self.b) * 2

class Square(Rectangle):
    def __init__(self, side):
        super().__init__(side, side)
        self.name = 'square'

        def area(self):
            return self.side ** 2

        def perimetr(self):
            return self.side * 4


class Student:
    def __init__(self, name, unic):
        self.name = name
        self.unic = unic

class Employee:
    def __init__(self, name, work):
        self.name = name
        self.work = work

class Person:
    def __init__(self, name):
        self.name = name
        

# create a exemplar
circle = Circle(5)
square = Square(5)

men = [
    Student('A', 'ox'),
    Employee('B', 'GOG'),
    Person('A')
]

# worcking with exemplar
shape_info(circle)
shape_info(square)


print(Fruit.get_count)


for man in men:
    if isinstance(man, Student):
        print(man.unic)
    elif isinstance(man, Employee):
        print(man.work)
    elif isinstance(man, Person):
        print(man.name)

        


 
