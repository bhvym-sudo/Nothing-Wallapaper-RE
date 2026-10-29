.class public final LP8/E$a;
.super Ljava/io/Reader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final q:Le9/g;

.field private final r:Ljava/nio/charset/Charset;

.field private s:Z

.field private t:Ljava/io/Reader;


# direct methods
.method public constructor <init>(Le9/g;Ljava/nio/charset/Charset;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    iput-object p1, p0, LP8/E$a;->q:Le9/g;

    iput-object p2, p0, LP8/E$a;->r:Ljava/nio/charset/Charset;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LP8/E$a;->s:Z

    iget-object v0, p0, LP8/E$a;->t:Ljava/io/Reader;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    sget-object v0, Lh8/A;->a:Lh8/A;

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-nez v0, :cond_15

    iget-object p0, p0, LP8/E$a;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->close()V

    :cond_15
    return-void
.end method

.method public read([CII)I
    .registers 8

    const-string v0, "cbuf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LP8/E$a;->s:Z

    if-nez v0, :cond_27

    iget-object v0, p0, LP8/E$a;->t:Ljava/io/Reader;

    if-nez v0, :cond_22

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, LP8/E$a;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->f1()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, LP8/E$a;->q:Le9/g;

    iget-object v3, p0, LP8/E$a;->r:Ljava/nio/charset/Charset;

    invoke-static {v2, v3}, LQ8/d;->I(Le9/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, LP8/E$a;->t:Ljava/io/Reader;

    :cond_22
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    move-result p0

    return p0

    :cond_27
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Stream closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
