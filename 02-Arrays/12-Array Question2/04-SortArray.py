def SortArray (arr , N ):
  low , mid , high = 0, 0, N-1
  while mid <= high :
        if arr[mid] == 0  :
            temp = arr[low]
            arr[low] = arr[mid]
            arr[mid] = temp

            low +=  1
            mid +=  1
        elif arr[mid] ==  1  :
            mid +=  1
        elif arr[mid] == 2 :
            temp  =  arr[mid]
            arr[mid] = arr[high]
            arr[high] = temp
            high -=  1
arr =  [0,1,2,0,0,1]
N =  len(arr)
SortArray(arr,N)
print(arr)       
