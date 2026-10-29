.class public final Lx6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/p;


# instance fields
.field private final a:Lx6/k;


# direct methods
.method public constructor <init>(Lx6/k;)V
    .registers 3

    const-string v0, "effectAssetManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/f;->a:Lx6/k;

    return-void
.end method

.method public static final synthetic c(Lx6/f;)Lx6/k;
    .registers 1

    iget-object p0, p0, Lx6/f;->a:Lx6/k;

    return-object p0
.end method


# virtual methods
.method public a()V
    .registers 1

    iget-object p0, p0, Lx6/f;->a:Lx6/k;

    invoke-virtual {p0}, Lx6/k;->k()V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .registers 4

    new-instance v0, Lx6/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lx6/f$a;-><init>(Lx6/f;Ljava/util/List;Lm8/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
