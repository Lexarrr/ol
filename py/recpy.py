import requests

# moduls and their used
# import low
import requests

key = '567640b9de62072faae28ee29f071059'
city = input('input name your city: ')

# ссылка, с которой мы получим все данные в формате JSON
url = 'http://api.openweathermap.org/data/2.5/weather'

# Дополнительные парамтеры (Ключ, город введенный пользователем и единицины измерения - metric означает Цельсий)
params = {'APPID': key, 'q': city, 'units': 'metric'}

result = requests.get(url, params=params)
res = result.json()
print('real temp: ', res['main']['temp'], 'C°')
print('feels like: ', res['main']['feels_like'], 'C°')


# pip install psycopg2
# connection
# cursor

