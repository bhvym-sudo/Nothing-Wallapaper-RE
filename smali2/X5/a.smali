.class public LX5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:J

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, LX5/a;->a:J

    const/4 v2, 0x0

    .line 3
    iput-object v2, p0, LX5/a;->b:Ljava/lang/String;

    .line 4
    iput-wide v0, p0, LX5/a;->c:J

    .line 5
    iput-wide v0, p0, LX5/a;->d:J

    .line 6
    iput-object v2, p0, LX5/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;JJLjava/lang/String;)V
    .registers 9

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, LX5/a;->a:J

    .line 9
    iput-object p3, p0, LX5/a;->b:Ljava/lang/String;

    .line 10
    iput-wide p4, p0, LX5/a;->c:J

    .line 11
    iput-wide p6, p0, LX5/a;->d:J

    .line 12
    iput-object p8, p0, LX5/a;->e:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/database/Cursor;)LX5/a;
    .registers 12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cursor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CalendarSimpleData"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p0, :cond_a2

    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_a2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCount "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "event_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const-string v0, "title"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v0, "eventLocation"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v0, "begin"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const-string v0, "end"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Next calendar event is loaded. id = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", title = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dtStart = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", dtEnd = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, LX5/a;

    invoke-direct/range {v2 .. v10}, LX5/a;-><init>(JLjava/lang/String;JJLjava/lang/String;)V

    return-object v2

    :cond_a2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b()J
    .registers 3

    iget-wide v0, p0, LX5/a;->d:J

    return-wide v0
.end method

.method public c()I
    .registers 5

    invoke-virtual {p0}, LX5/a;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x14

    cmp-long p0, v0, v2

    if-lez p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const-wide/16 v2, -0xa

    cmp-long p0, v0, v2

    if-lez p0, :cond_1c

    const/4 p0, 0x2

    return p0

    :cond_1c
    const/4 p0, 0x3

    return p0
.end method

.method public d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LX5/a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public e()J
    .registers 3

    iget-wide v0, p0, LX5/a;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p1, :cond_41

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_12

    goto :goto_41

    :cond_12
    check-cast p1, LX5/a;

    iget-wide v2, p0, LX5/a;->a:J

    iget-wide v4, p1, LX5/a;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_41

    iget-object v2, p0, LX5/a;->b:Ljava/lang/String;

    iget-object v3, p1, LX5/a;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_41

    iget-wide v2, p0, LX5/a;->c:J

    iget-wide v4, p1, LX5/a;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_41

    iget-wide v2, p0, LX5/a;->d:J

    iget-wide v4, p1, LX5/a;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_41

    iget-object p0, p0, LX5/a;->e:Ljava/lang/String;

    iget-object p1, p1, LX5/a;->e:Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_41

    return v0

    :cond_41
    :goto_41
    return v1
.end method

.method public f()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LX5/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public g()J
    .registers 6

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v1, p0, LX5/a;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v3

    sub-long/2addr v1, v3

    return-wide v1
.end method

.method public h()Z
    .registers 3

    invoke-virtual {p0}, LX5/a;->c()I

    move-result p0

    const/4 v0, 0x1

    if-eq v0, p0, :cond_d

    const/4 v1, 0x2

    if-ne v1, p0, :cond_b

    goto :goto_d

    :cond_b
    const/4 p0, 0x0

    return p0

    :cond_d
    :goto_d
    return v0
.end method

.method public hashCode()I
    .registers 6

    iget-wide v0, p0, LX5/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, LX5/a;->b:Ljava/lang/String;

    iget-wide v2, p0, LX5/a;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, LX5/a;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object p0, p0, LX5/a;->e:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method
