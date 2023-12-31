colornames=input("enter the colors by comma :: ")
colors=colornames.split(",")
colors=[color.strip() for color in colors]
if len(colors)>=2:
    print("1 st color ::",colors[0])
    print("end color ::",colors[-1])
else:
    print("atleast 2 colors")