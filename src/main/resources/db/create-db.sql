create sequence taskhistory_idtaskhistory_seq;

CREATE TABLE TASKHISTORY (
  idTaskHistory int default taskhistory_idtaskhistory_seq.nextval unique,
  freq_word VARCHAR(50),
  avg_paragraph_size  VARCHAR(50),
  avg_paragraph_processing_time varchar(50),
  total_processing_time varchar(50),
  PRIMARY KEY (idTaskHistory)
);