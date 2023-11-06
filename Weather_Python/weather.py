from tkinter import *
import requests
import json
from datetime import datetime
#Initialize Window

Font_tuple = ("Comic Sans MS", 20, "bold")
  
# Parsed the specifications to the
# Text widget using .configure( ) method.

 
root =Tk()
root.geometry("1000x700") #size of the window by default
root.resizable(0,0) #to make the window size fixed
#title of our window
root.title("Weather App - AskPython.com")
root.configure( background='lavender')


 
# ----------------------Functions to fetch and display weather info
city_value = StringVar()
 
 
def time_format_for_location(utc_with_tz):
    local_time = datetime.utcfromtimestamp(utc_with_tz)
    return local_time.time()
 
 
city_value = StringVar()
 
def showWeather():
    #Enter you api key, copies from the OpenWeatherMap dashboard
    api_key = "9176ced8f38f239ed6b26bb746024cf2"  #sample API
 
    # Get city name from user from the input field (later in the code)
    city_name=city_value.get()
 
    # API url
    weather_url = 'http://api.openweathermap.org/data/2.5/weather?q=' + city_name + '&appid='+api_key
 
    # Get the response from fetched url
    response = requests.get(weather_url)
 
    # changing response from json to python readable 
    weather_info = response.json()
 
 
    tfield.delete("1.0", "end")   #to clear the text field for every new output
 
#as per API documentation, if the cod is 200, it means that weather data was successfully fetched
 
 
    if weather_info['cod'] == 200:
        kelvin = 273 # value of kelvin
 
#-----------Storing the fetched values of weather of a city
 
        temp = int(weather_info['main']['temp'] - kelvin)                                     #converting default kelvin value to Celcius
        feels_like_temp = int(weather_info['main']['feels_like'] - kelvin)
        pressure = weather_info['main']['pressure']
        humidity = weather_info['main']['humidity']
        wind_speed = weather_info['wind']['speed'] * 3.6
        sunrise = weather_info['sys']['sunrise']
        sunset = weather_info['sys']['sunset']
        timezone = weather_info['timezone']
        cloudy = weather_info['clouds']['all']
        description = weather_info['weather'][0]['description']
 
        sunrise_time = time_format_for_location(sunrise + timezone)
        sunset_time = time_format_for_location(sunset + timezone)
 
#assigning Values to our weather varaible, to display as output
         
        weather = f"\n\tWeather of: {city_name}\n\tTemperature (Celsius): {temp}°\n\tFeels like in (Celsius): {feels_like_temp}°\n\tPressure: {pressure} hPa\n\tHumidity: {humidity}%\n\tSunrise at {sunrise_time} and Sunset at {sunset_time}\n\tCloud: {cloudy}%\n\tInfo: {description}"
    else:
        weather = f"\n\tWeather for '{city_name}' not found!\n\tKindly Enter valid City Name !!"
 
 
 
    tfield.insert(INSERT, weather)   #to insert or send value in our Text Field to display output
 
 
 
#------------------------------Frontend part of code - Interface
 
 
city_head= Label(root, text = 'Enter City Name', font = 'Arial 14 bold', background='lavender', foreground='teal').pack(pady=20) #to generate label heading
inp_city = Entry(root, textvariable = city_value,  width = 34, font='Arial 14 bold', background='lavender', foreground='teal').pack()
#inp_city.configure(font = Font_tuple,foreground="royalblue",background="peach puff")

#button = Button(text="Button")
#button=Entry(highlightthickness=2)
#button.config(highlightbackground="red",highlightcolor= "red")
Button(root, command = showWeather,text = "Check Weather", font="Arial 14", background='lavender', foreground='teal', activebackground="teal", padx=15, pady=15,borderwidth=3, relief="solid").pack(pady= 20)
#to show output
weather_now = Label(root, text = "The Weather is:", font = 'arial 14 bold', background='lavender', foreground='purple').pack(pady=30)
#weather_now.configure(font = Font_tuple,foreground="royalblue",background="peach puff")
tfield = Text(root, width=86, height=30)
tfield.configure(font = Font_tuple,foreground="royalblue",background="peach puff")
tfield.pack()
 
root.mainloop()
