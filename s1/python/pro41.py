import json
data={
  "name":"john",
  "age":"30",
  "city":"New york"
 }
json_data=json.dumps(data,indent=4)
print("JSON Data:")
print(json_data)
json_string='{"name":"Alice","age":25,"city":"London"}'
parsed_data=json.loads(json_string)
print("parsed Data :")
print(parsed_data)
json_string='{"name":"Alice","age":25,"city":"London"}'
parsed_data=json.loads(json_string)
print("Parsed Data :",parsed_data)
