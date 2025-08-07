def HasPairSum(arr, size, Target) :
   max = float('-inf')
   min = float('inf')
   for i in arr :
      if i > max :
          max =  i
      if i < min :
          min = i
   visited = [False] * (max - min +1)
   for i in range (size) :
      complement =  Target - arr[i]
      if complement >= min and complement <= max and visited[complement - min] :
          return True
      visited[arr[i] - min] = True
   return False

arr =  [0,-1,2,-3,1]
size =  len(arr)
Target = -2
if HasPairSum(arr, size, Target) :
     print ("Found a pair that sums to Target: true" , Target)
else :
     print ("Found a pair that sums to Target: false" ,Target)
