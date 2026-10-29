.class public final LC6/e$c;
.super LC6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:LC6/e$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LC6/e$c;

    invoke-direct {v0}, LC6/e$c;-><init>()V

    sput-object v0, LC6/e$c;->c:LC6/e$c;

    return-void
.end method

.method private constructor <init>()V
    .registers 4

    const v0, 0x7f1300e6

    const/4 v1, 0x0

    const-string v2, "ORIGIN"

    invoke-direct {p0, v2, v0, v1}, LC6/e;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)LE6/a$a;
    .registers 2

    const-string p0, "str"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method
