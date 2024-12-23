WITH total_email_sent AS (
    SELECT
        from_user,
        COUNT(id) AS total_emails
    FROM google_gmail_emails
    GROUP BY from_user
)
SELECT
    from_user,
    total_emails,
    ROW_NUMBER() OVER(ORDER BY total_emails DESC, from_user ASC)
FROM total_email_sent;