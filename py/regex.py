# regular expression
# groupping ()
# [есн] - в строке присутствуют любой из этих символов\
# r'\d' - 1, 2, 3...
# [a-z] - any symb from a to z
# [a-zA-Z] any symb ...
# [^abcd] - except abcd

# quantifier
# m - min
# n - max
# {m} - ровно m раз
# {m,} - ровно m раз и более
# {,n} - ровно n раз и менее
# {m, n} - от m до n
# . - any symb
# * - from 0 to ...(32767) - {0,}
# ? - from 1 to ...(32767) - {1,}
# 



import re

pattern = r'\b\w{4}\b'
testString = 'Мама мыла раму, а папа уехал на пилораму'

result = re.findall(pattern, testString)
print(result)


pattern = '[^abcd]'
testString = 'ABCDing - is that show!'

result = re.findall(pattern, testString, re.I)
print(*result, sep='')


pattern = r'\((.+?)\)' # execute any from ()
testString = 'Find on pattern (pattern)'

result = re.findall(pattern, testString, re.I)
print(*result, sep='')

# with 3 o and many
pattern = r'Go{3,}gle' 
testString = 'Google, Gooogle, Goooooogle'

result = re.findall(pattern, testString, re.I)
print(result)

#  Find numder from +7 & eq 10 numbs
pattern = r'\+7\d{10}[^()-]' 
testString = 'Google: +7(921)123-45-11'

result = re.findall(pattern, testString, re.I)
print(result)

pattern = r'<img.*>' 
testString = 'Pic <img src="bg.jpg"> from text</p>'

result = re.findall(pattern, testString, re.I)
print(result)

pattern = r'<img.*?>' 
testString = 'Pic <img src="bg.jpg"> from text</p>'

result = re.findall(pattern, testString, re.I)
print(result[0])

pattern = r'<img[^>]+src="([^">]+)">' 
testString = 'Pic <img src="bg.jpg"> from text</p>'

result = re.findall(pattern, testString, re.I)
print(result[0])

pattern = r'<p>(.*)</p>' # ?
testString = '<p>TExt1</p><p>TExt 2</p>.<i>italic</i>'

result = re.findall(pattern, testString, re.I)
print(result[0])

pattern = r'<p[^>]*>(.*?)</p>'
testString = '<b>Centring: </b><p aling="center">TExt 2</p>'

result = re.findall(pattern, testString, re.I)
print(result[0])

pattern = r'http(?:s)?://[\S]+'
testString = 'Info exist on site https://google.com>'

result = re.findall(pattern, testString)
print(result[0])

pattern = r'<a.*?>(.*?)</a>'
testString = 'Info exist on site <a href="https://google.com">Google</a>'

result = re.findall(pattern, testString)
print(result[0])
