.class public final LS8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:LP8/B;

.field private final c:LP8/D;

.field private d:Ljava/util/Date;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/Date;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/Date;

.field private i:J

.field private j:J

.field private k:Ljava/lang/String;

.field private l:I


# direct methods
.method public constructor <init>(JLP8/B;LP8/D;)V
    .registers 9

    const-string v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LS8/b$b;->a:J

    iput-object p3, p0, LS8/b$b;->b:LP8/B;

    iput-object p4, p0, LS8/b$b;->c:LP8/D;

    const/4 p1, -0x1

    iput p1, p0, LS8/b$b;->l:I

    if-eqz p4, :cond_80

    invoke-virtual {p4}, LP8/D;->w0()J

    move-result-wide p2

    iput-wide p2, p0, LS8/b$b;->i:J

    invoke-virtual {p4}, LP8/D;->q0()J

    move-result-wide p2

    iput-wide p2, p0, LS8/b$b;->j:J

    invoke-virtual {p4}, LP8/D;->I()LP8/u;

    move-result-object p2

    invoke-virtual {p2}, LP8/u;->size()I

    move-result p3

    const/4 p4, 0x0

    :goto_28
    if-ge p4, p3, :cond_80

    invoke-virtual {p2, p4}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p4}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Date"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_44

    invoke-static {v1}, LV8/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, LS8/b$b;->d:Ljava/util/Date;

    iput-object v1, p0, LS8/b$b;->e:Ljava/lang/String;

    goto :goto_7d

    :cond_44
    const-string v2, "Expires"

    invoke-static {v0, v2, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_53

    invoke-static {v1}, LV8/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, LS8/b$b;->h:Ljava/util/Date;

    goto :goto_7d

    :cond_53
    const-string v2, "Last-Modified"

    invoke-static {v0, v2, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_64

    invoke-static {v1}, LV8/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, LS8/b$b;->f:Ljava/util/Date;

    iput-object v1, p0, LS8/b$b;->g:Ljava/lang/String;

    goto :goto_7d

    :cond_64
    const-string v2, "ETag"

    invoke-static {v0, v2, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_6f

    iput-object v1, p0, LS8/b$b;->k:Ljava/lang/String;

    goto :goto_7d

    :cond_6f
    const-string v2, "Age"

    invoke-static {v0, v2, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7d

    invoke-static {v1, p1}, LQ8/d;->V(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LS8/b$b;->l:I

    :cond_7d
    :goto_7d
    add-int/lit8 p4, p4, 0x1

    goto :goto_28

    :cond_80
    return-void
.end method

.method private final a()J
    .registers 10

    iget-object v0, p0, LS8/b$b;->d:Ljava/util/Date;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_11

    iget-wide v3, p0, LS8/b$b;->j:J

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_11
    iget v0, p0, LS8/b$b;->l:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_21

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_21
    iget-wide v3, p0, LS8/b$b;->j:J

    iget-wide v5, p0, LS8/b$b;->i:J

    sub-long v5, v3, v5

    iget-wide v7, p0, LS8/b$b;->a:J

    sub-long/2addr v7, v3

    add-long/2addr v1, v5

    add-long/2addr v1, v7

    return-wide v1
.end method

.method private final c()LS8/b;
    .registers 14

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    const/4 v1, 0x0

    if-nez v0, :cond_d

    new-instance v0, LS8/b;

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v0

    :cond_d
    iget-object v0, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {v0}, LP8/B;->f()Z

    move-result v0

    if-eqz v0, :cond_25

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    invoke-virtual {v0}, LP8/D;->z()LP8/t;

    move-result-object v0

    if-nez v0, :cond_25

    new-instance v0, LS8/b;

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v0

    :cond_25
    sget-object v0, LS8/b;->c:LS8/b$a;

    iget-object v2, p0, LS8/b$b;->c:LP8/D;

    iget-object v3, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {v0, v2, v3}, LS8/b$a;->a(LP8/D;LP8/B;)Z

    move-result v0

    if-nez v0, :cond_39

    new-instance v0, LS8/b;

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v0

    :cond_39
    iget-object v0, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {v0}, LP8/B;->b()LP8/d;

    move-result-object v0

    invoke-virtual {v0}, LP8/d;->g()Z

    move-result v2

    if-nez v2, :cond_122

    iget-object v2, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {p0, v2}, LS8/b$b;->e(LP8/B;)Z

    move-result v2

    if-eqz v2, :cond_4f

    goto/16 :goto_122

    :cond_4f
    iget-object v2, p0, LS8/b$b;->c:LP8/D;

    invoke-virtual {v2}, LP8/D;->b()LP8/d;

    move-result-object v2

    invoke-direct {p0}, LS8/b$b;->a()J

    move-result-wide v3

    invoke-direct {p0}, LS8/b$b;->d()J

    move-result-wide v5

    invoke-virtual {v0}, LP8/d;->c()I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_73

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, LP8/d;->c()I

    move-result v9

    int-to-long v9, v9

    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_73
    invoke-virtual {v0}, LP8/d;->e()I

    move-result v7

    const-wide/16 v9, 0x0

    if-eq v7, v8, :cond_87

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, LP8/d;->e()I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v7, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    goto :goto_88

    :cond_87
    move-wide v11, v9

    :goto_88
    invoke-virtual {v2}, LP8/d;->f()Z

    move-result v7

    if-nez v7, :cond_9f

    invoke-virtual {v0}, LP8/d;->d()I

    move-result v7

    if-eq v7, v8, :cond_9f

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, LP8/d;->d()I

    move-result v0

    int-to-long v8, v0

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    :cond_9f
    invoke-virtual {v2}, LP8/d;->g()Z

    move-result v0

    if-nez v0, :cond_d8

    add-long/2addr v11, v3

    add-long/2addr v9, v5

    cmp-long v0, v11, v9

    if-gez v0, :cond_d8

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    invoke-virtual {v0}, LP8/D;->U()LP8/D$a;

    move-result-object v0

    cmp-long v2, v11, v5

    const-string v5, "Warning"

    if-ltz v2, :cond_bc

    const-string v2, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v0, v5, v2}, LP8/D$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/D$a;

    :cond_bc
    const-wide/32 v6, 0x5265c00

    cmp-long v2, v3, v6

    if-lez v2, :cond_ce

    invoke-direct {p0}, LS8/b$b;->f()Z

    move-result p0

    if-eqz p0, :cond_ce

    const-string p0, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v0, v5, p0}, LP8/D$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/D$a;

    :cond_ce
    new-instance p0, LS8/b;

    invoke-virtual {v0}, LP8/D$a;->c()LP8/D;

    move-result-object v0

    invoke-direct {p0, v1, v0}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object p0

    :cond_d8
    iget-object v0, p0, LS8/b$b;->k:Ljava/lang/String;

    if-eqz v0, :cond_df

    const-string v1, "If-None-Match"

    goto :goto_f0

    :cond_df
    iget-object v0, p0, LS8/b$b;->f:Ljava/util/Date;

    const-string v2, "If-Modified-Since"

    if-eqz v0, :cond_e9

    iget-object v0, p0, LS8/b$b;->g:Ljava/lang/String;

    :goto_e7
    move-object v1, v2

    goto :goto_f0

    :cond_e9
    iget-object v0, p0, LS8/b$b;->d:Ljava/util/Date;

    if-eqz v0, :cond_11a

    iget-object v0, p0, LS8/b$b;->e:Ljava/lang/String;

    goto :goto_e7

    :goto_f0
    iget-object v2, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {v2}, LP8/B;->e()LP8/u;

    move-result-object v2

    invoke-virtual {v2}, LP8/u;->f()LP8/u$a;

    move-result-object v2

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v0}, LP8/u$a;->d(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    iget-object v0, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {v0}, LP8/B;->h()LP8/B$a;

    move-result-object v0

    invoke-virtual {v2}, LP8/u$a;->f()LP8/u;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/B$a;->d(LP8/u;)LP8/B$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/B$a;->b()LP8/B;

    move-result-object v0

    new-instance v1, LS8/b;

    iget-object p0, p0, LS8/b$b;->c:LP8/D;

    invoke-direct {v1, v0, p0}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v1

    :cond_11a
    new-instance v0, LS8/b;

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v0

    :cond_122
    :goto_122
    new-instance v0, LS8/b;

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object v0
.end method

.method private final d()J
    .registers 8

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP8/D;->b()LP8/d;

    move-result-object v0

    invoke-virtual {v0}, LP8/d;->c()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1c

    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, LP8/d;->c()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0

    :cond_1c
    iget-object v0, p0, LS8/b$b;->h:Ljava/util/Date;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_38

    iget-object v3, p0, LS8/b$b;->d:Ljava/util/Date;

    if-eqz v3, :cond_2b

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_2d

    :cond_2b
    iget-wide v3, p0, LS8/b$b;->j:J

    :goto_2d
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v5, v3

    cmp-long p0, v5, v1

    if-lez p0, :cond_37

    return-wide v5

    :cond_37
    return-wide v1

    :cond_38
    iget-object v0, p0, LS8/b$b;->f:Ljava/util/Date;

    if-eqz v0, :cond_6a

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    invoke-virtual {v0}, LP8/D;->t0()LP8/B;

    move-result-object v0

    invoke-virtual {v0}, LP8/B;->j()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->o()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6a

    iget-object v0, p0, LS8/b$b;->d:Ljava/util/Date;

    if-eqz v0, :cond_55

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_57

    :cond_55
    iget-wide v3, p0, LS8/b$b;->i:J

    :goto_57
    iget-object p0, p0, LS8/b$b;->f:Ljava/util/Date;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long p0, v3, v1

    if-lez p0, :cond_6a

    const/16 p0, 0xa

    int-to-long v0, p0

    div-long/2addr v3, v0

    return-wide v3

    :cond_6a
    return-wide v1
.end method

.method private final e(LP8/B;)Z
    .registers 2

    const-string p0, "If-Modified-Since"

    invoke-virtual {p1, p0}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_13

    const-string p0, "If-None-Match"

    invoke-virtual {p1, p0}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_11

    goto :goto_13

    :cond_11
    const/4 p0, 0x0

    return p0

    :cond_13
    :goto_13
    const/4 p0, 0x1

    return p0
.end method

.method private final f()Z
    .registers 3

    iget-object v0, p0, LS8/b$b;->c:LP8/D;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP8/D;->b()LP8/d;

    move-result-object v0

    invoke-virtual {v0}, LP8/d;->c()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_16

    iget-object p0, p0, LS8/b$b;->h:Ljava/util/Date;

    if-nez p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final b()LS8/b;
    .registers 3

    invoke-direct {p0}, LS8/b$b;->c()LS8/b;

    move-result-object v0

    invoke-virtual {v0}, LS8/b;->b()LP8/B;

    move-result-object v1

    if-eqz v1, :cond_1d

    iget-object p0, p0, LS8/b$b;->b:LP8/B;

    invoke-virtual {p0}, LP8/B;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->i()Z

    move-result p0

    if-eqz p0, :cond_1d

    new-instance p0, LS8/b;

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, LS8/b;-><init>(LP8/B;LP8/D;)V

    return-object p0

    :cond_1d
    return-object v0
.end method
