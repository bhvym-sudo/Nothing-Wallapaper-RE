.class public final LC6/e$b;
.super LC6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:LC6/e$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LC6/e$b;

    invoke-direct {v0}, LC6/e$b;-><init>()V

    sput-object v0, LC6/e$b;->c:LC6/e$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 4

    const v0, 0x7f1300e4

    const/4 v1, 0x0

    const-string v2, "Glass"

    invoke-direct {p0, v2, v0, v1}, LC6/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/String;)LE6/a$a;
    .registers 2

    invoke-virtual {p0, p1}, LC6/e$b;->c(Ljava/lang/String;)LF6/a$b;

    move-result-object p0

    return-object p0
.end method

.method public c(Ljava/lang/String;)LF6/a$b;
    .registers 2

    const-string p0, "str"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LF6/a$b;->d:LF6/a$b$a;

    invoke-virtual {p0, p1}, LF6/a$b$a;->b(Ljava/lang/String;)LF6/a$b;

    move-result-object p0

    return-object p0
.end method
