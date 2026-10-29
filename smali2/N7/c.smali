.class public final synthetic LN7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/RemoteCallback$OnResultListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/E;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/c;->a:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 2

    iget-object p0, p0, LN7/c;->a:Lkotlin/jvm/internal/E;

    invoke-static {p0, p1}, LN7/f;->b(Lkotlin/jvm/internal/E;Landroid/os/Bundle;)V

    return-void
.end method
