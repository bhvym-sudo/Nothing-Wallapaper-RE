.class public final synthetic LF8/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/E;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/E;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/E;->q:Lkotlin/jvm/internal/E;

    iput-boolean p2, p0, LF8/E;->r:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LF8/E;->q:Lkotlin/jvm/internal/E;

    iget-boolean p0, p0, LF8/E;->r:Z

    check-cast p1, Lm8/i;

    check-cast p2, Lm8/i$b;

    invoke-static {v0, p0, p1, p2}, LF8/G;->a(Lkotlin/jvm/internal/E;ZLm8/i;Lm8/i$b;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
