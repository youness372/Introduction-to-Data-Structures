
def Twosum (nums, Target) :
  n =  len(nums)
  for i in range (n-1):
    for j in range (i+1,n) :
      if nums[i]  + nums[j] ==  Target :
         return [i,j]
  return None

nums =  [10,20,30,40,50]
Target =  70
result = TwoSum(nums , Target)
if result is not  None :
    print (""Indices: " ,result[0] ,", " , result[1]" )
else :
  print ("No two sum solution found.")
