import json
import pymysql

json_data = open("candidatos.json")
json_obj = json.load(json_data)

records = json_obj['candidatos']
record_insert = []
for i in records:
    record_insert.append((i['_id'], i['nome'], i['vaga'], i['data_nascimento']))


mysql_insertData = 'INSERT INTO tblCANDIDATOS(_id, nome, vaga, data_nascimento) VALUES (%s,%s,%s,%s)'

con = pymysql.connect(host="docker-mysql", user="root", password="root", db="candidatos")
cursor = con.cursor()
cursor.executemany(mysql_insertData, record_insert)
con.commit()
print(cursor.rowcount, "Dados inseridos com sucesso sobre candidatos")

con.close()
json_data.close()
