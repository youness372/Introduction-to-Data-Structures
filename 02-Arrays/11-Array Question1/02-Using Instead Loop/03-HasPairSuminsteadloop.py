def hasPairSum(arr, size, Target) :
  for i in range (len(arr)-1) :
    for j in range (i+1 , len(arr)) :
      if arr[i] + arr[j] == Target :
          return  True
  return False
arr =  [0,-1,2,-3,1]
size = len(arr)
Target = -2
if hasPairSum (arr , size , Target)  :
    print("the sum of two elements in the array equal to Target is : " , Target)
else :
    print("the sum of two elements in the array equal to Target is : " ,Target)
