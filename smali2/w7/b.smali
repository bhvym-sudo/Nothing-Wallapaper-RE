.class public final Lw7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv7/b;

.field private final b:LI8/O;


# direct methods
.method public constructor <init>(Lv7/b;)V
    .registers 3

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/b;->a:Lv7/b;

    invoke-virtual {p1}, Lv7/b;->a()LI8/O;

    move-result-object p1

    iput-object p1, p0, Lw7/b;->b:LI8/O;

    return-void
.end method


# virtual methods
.method public final a()LI8/O;
    .registers 1

    iget-object p0, p0, Lw7/b;->b:LI8/O;

    return-object p0
.end method

.method public final b(Z)V
    .registers 2

    iget-object p0, p0, Lw7/b;->a:Lv7/b;

    invoke-virtual {p0, p1}, Lv7/b;->b(Z)V

    return-void
.end method
