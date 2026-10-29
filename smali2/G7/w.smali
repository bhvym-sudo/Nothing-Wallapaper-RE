.class public final synthetic LG7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/E;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/w;->q:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LG7/w;->q:Lkotlin/jvm/internal/E;

    invoke-static {p0}, LG7/v$c$a;->s(Lkotlin/jvm/internal/E;)V

    return-void
.end method
