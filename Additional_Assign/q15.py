sample_list = [(2,5),(1,2),(4,4),(2,3),(2,1)]
expected_result = sorted(sample_list,key=lambda x:x[-1])
print(expected_result)