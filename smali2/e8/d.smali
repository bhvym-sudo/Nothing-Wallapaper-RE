.class public Le8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Lc8/a;

.field public h:I

.field private i:I

.field public j:F

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Le8/d;->j:F

    return-void
.end method

.method private c(I)Z
    .registers 2

    if-ltz p1, :cond_8

    const/16 p0, 0x9

    if-gt p1, p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public static d(La8/c;)Z
    .registers 1

    invoke-static {p0}, La8/c;->b(La8/c;)Z

    move-result p0

    return p0
.end method

.method private f(II)Z
    .registers 12

    invoke-direct {p0, p1}, Le8/d;->c(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8b

    invoke-direct {p0, p2}, Le8/d;->c(I)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_8b

    :cond_f
    const/4 p0, 0x3

    const/16 v0, 0x9

    const/4 v2, 0x7

    const/16 v3, 0x8

    const/4 v4, 0x4

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x2

    const/4 v8, 0x1

    packed-switch p1, :pswitch_data_8c

    return v1

    :pswitch_1e
    if-eq v7, p2, :cond_2c

    if-eqz p2, :cond_2c

    if-eq v8, p2, :cond_2c

    if-eq v5, p2, :cond_2c

    if-eq v2, p2, :cond_2c

    if-ne v0, p2, :cond_2b

    goto :goto_2c

    :cond_2b
    return v1

    :cond_2c
    :goto_2c
    return v8

    :pswitch_2d
    if-eq v7, p2, :cond_3b

    if-eqz p2, :cond_3b

    if-eq v8, p2, :cond_3b

    if-eq v4, p2, :cond_3b

    if-eq v6, p2, :cond_3b

    if-ne v3, p2, :cond_3a

    goto :goto_3b

    :cond_3a
    return v1

    :cond_3b
    :goto_3b
    return v8

    :pswitch_3c
    if-eq v7, p2, :cond_4c

    if-eqz p2, :cond_4c

    if-eq v8, p2, :cond_4c

    if-eq v5, p2, :cond_4c

    if-eq v3, p2, :cond_4c

    if-eq v2, p2, :cond_4c

    if-ne v0, p2, :cond_4b

    goto :goto_4c

    :cond_4b
    return v1

    :cond_4c
    :goto_4c
    return v8

    :pswitch_4d
    if-eq v7, p2, :cond_5b

    if-eqz p2, :cond_5b

    if-eq v8, p2, :cond_5b

    if-eq v6, p2, :cond_5b

    if-eq v5, p2, :cond_5b

    if-ne v3, p2, :cond_5a

    goto :goto_5b

    :cond_5a
    return v1

    :cond_5b
    :goto_5b
    return v8

    :pswitch_5c
    if-eq v7, p2, :cond_68

    if-eqz p2, :cond_68

    if-eq v8, p2, :cond_68

    if-eq v4, p2, :cond_68

    if-ne v6, p2, :cond_67

    goto :goto_68

    :cond_67
    return v1

    :cond_68
    :goto_68
    return v8

    :pswitch_69
    if-eqz p2, :cond_77

    if-eq v7, p2, :cond_77

    if-eq v8, p2, :cond_77

    if-eq p0, p2, :cond_77

    if-eq v4, p2, :cond_77

    if-ne v6, p2, :cond_76

    goto :goto_77

    :cond_76
    return v1

    :cond_77
    :goto_77
    return v8

    :pswitch_78
    if-ne v7, p2, :cond_7b

    return v8

    :cond_7b
    return v1

    :pswitch_7c
    if-ne v8, p2, :cond_7f

    return v8

    :cond_7f
    return v1

    :pswitch_80
    if-eqz p2, :cond_8a

    if-eq v7, p2, :cond_8a

    if-eq v8, p2, :cond_8a

    if-ne p0, p2, :cond_89

    goto :goto_8a

    :cond_89
    return v1

    :cond_8a
    :goto_8a
    return v8

    :cond_8b
    :goto_8b
    return v1

    :pswitch_data_8c
    .packed-switch 0x0
        :pswitch_80
        :pswitch_7c
        :pswitch_78
        :pswitch_69
        :pswitch_5c
        :pswitch_4d
        :pswitch_3c
        :pswitch_3c
        :pswitch_2d
        :pswitch_1e
    .end packed-switch
.end method


# virtual methods
.method public a()I
    .registers 4

    iget-object v0, p0, Le8/d;->g:Lc8/a;

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {v0}, Lc8/a;->a()I

    move-result v0

    const/4 v2, 0x2

    iget-object p0, p0, Le8/d;->g:Lc8/a;

    if-ne v2, v0, :cond_16

    iget-object p0, p0, Lc8/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0

    :cond_16
    invoke-virtual {p0}, Lc8/a;->a()I

    move-result p0

    const/4 v0, 0x1

    if-ne v0, p0, :cond_1e

    return v0

    :cond_1e
    const-string p0, "CurrentPlayingInfo"

    const-string v0, "getPatternCount(), invalid HE version!"

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public b(II)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "changePlayerStatus, from:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",to:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CurrentPlayingInfo"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Le8/d;->i:I

    invoke-direct {p0, v0, p1}, Le8/d;->f(II)Z

    move-result v0

    if-nez v0, :cond_4f

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "changePlayerStatus, invalid transition, from "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Le8/d;->i:I

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " to "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_4b
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4f
    iget v0, p0, Le8/d;->i:I

    if-ne p1, v0, :cond_58

    if-eqz p2, :cond_58

    const-string p0, "changePlayerStatus, needn\'t update"

    goto :goto_4b

    :cond_58
    iput p1, p0, Le8/d;->i:I

    return-void
.end method

.method public e()I
    .registers 1

    iget p0, p0, Le8/d;->i:I

    return p0
.end method

.method public g()V
    .registers 4

    iget-object v0, p0, Le8/d;->l:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Le8/d;->l:Ljava/lang/String;

    invoke-static {v0}, Ld8/c;->c(Ljava/lang/String;)V

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le8/d;->l:Ljava/lang/String;

    invoke-static {v0}, Ld8/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .registers 4

    const-string v0, "CurrentPlayingInfo"

    const-string v1, "reset!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Le8/d;->a:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Le8/d;->b:J

    const/4 v1, 0x0

    iput v1, p0, Le8/d;->c:I

    const/16 v2, 0xff

    iput v2, p0, Le8/d;->d:I

    iput v1, p0, Le8/d;->e:I

    iput v1, p0, Le8/d;->f:I

    iput-object v0, p0, Le8/d;->g:Lc8/a;

    iput v1, p0, Le8/d;->h:I

    iput v1, p0, Le8/d;->i:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Le8/d;->j:F

    iput-object v0, p0, Le8/d;->k:Ljava/lang/String;

    iput v1, p0, Le8/d;->m:I

    iput-object v0, p0, Le8/d;->o:Ljava/lang/String;

    iput v1, p0, Le8/d;->p:I

    iput v1, p0, Le8/d;->q:I

    iput-object v0, p0, Le8/d;->r:Ljava/lang/String;

    iget-object v1, p0, Le8/d;->l:Ljava/lang/String;

    if-eqz v1, :cond_3e

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3e

    iget-object v1, p0, Le8/d;->l:Ljava/lang/String;

    invoke-static {v1}, Ld8/c;->c(Ljava/lang/String;)V

    :cond_3e
    iput-object v0, p0, Le8/d;->l:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CurrentPlayingHeInfo{mHeString=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le8/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le8/d;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLoop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAmplitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeRoot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le8/d;->g:Lc8/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSyncCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mStartPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStatus:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le8/d;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedMultiple:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Le8/d;->j:F

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
