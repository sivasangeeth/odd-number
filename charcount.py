s=input()
count=0;
for i in s:
    if i.isalpha() or i.isnumeric():
        pass
    else:
        count+=1
print(count)
