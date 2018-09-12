USE blog_db;

INSERT INTO users (email, password, username)
VALUES
  ('pelletier.tylor@gmail.com', 'codeup', 'root');

INSERT INTO posts (body, title, user_id)
VALUES
  ('This is the body of the first post.', 'First Title', 1),
  ('This is the body of the second post.', 'Second Title', 1),
  ('This is the body of the third post.', 'Third Title', 1),
  ('This is the body of the fourth post.', 'Fourth Title', 1);

SELECT * FROM posts;
SELECT * FROM users;

SHOW TABLES;

DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;

