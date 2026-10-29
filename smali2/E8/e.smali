.class final LE8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lv8/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILv8/p;)V
    .registers 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/e;->a:Ljava/lang/CharSequence;

    iput p2, p0, LE8/e;->b:I

    iput p3, p0, LE8/e;->c:I

    iput-object p4, p0, LE8/e;->d:Lv8/p;

    return-void
.end method

.method public static final synthetic c(LE8/e;)Lv8/p;
    .registers 1

    iget-object p0, p0, LE8/e;->d:Lv8/p;

    return-object p0
.end method

.method public static final synthetic d(LE8/e;)Ljava/lang/CharSequence;
    .registers 1

    iget-object p0, p0, LE8/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic e(LE8/e;)I
    .registers 1

    iget p0, p0, LE8/e;->c:I

    return p0
.end method

.method public static final synthetic f(LE8/e;)I
    .registers 1

    iget p0, p0, LE8/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LE8/e$a;

    invoke-direct {v0, p0}, LE8/e$a;-><init>(LE8/e;)V

    return-object v0
.end method
