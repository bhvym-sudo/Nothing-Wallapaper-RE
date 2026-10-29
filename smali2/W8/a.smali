.class public final LW8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/a$a;
    }
.end annotation


# static fields
.field public static final c:LW8/a$a;


# instance fields
.field private final a:Le9/g;

.field private b:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW8/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW8/a;->c:LW8/a$a;

    return-void
.end method

.method public constructor <init>(Le9/g;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/a;->a:Le9/g;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, LW8/a;->b:J

    return-void
.end method


# virtual methods
.method public final a()LP8/u;
    .registers 4

    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    :goto_5
    invoke-virtual {p0}, LW8/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_14

    invoke-virtual {v0}, LP8/u$a;->f()LP8/u;

    move-result-object p0

    return-object p0

    :cond_14
    invoke-virtual {v0, v1}, LP8/u$a;->c(Ljava/lang/String;)LP8/u$a;

    goto :goto_5
.end method

.method public final b()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, LW8/a;->a:Le9/g;

    iget-wide v1, p0, LW8/a;->b:J

    invoke-interface {v0, v1, v2}, Le9/g;->O(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LW8/a;->b:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, LW8/a;->b:J

    return-object v0
.end method
