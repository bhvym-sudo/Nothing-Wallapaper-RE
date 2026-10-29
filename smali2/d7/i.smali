.class public final synthetic Ld7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/E;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/i;->q:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, Ld7/i;->q:Lkotlin/jvm/internal/E;

    invoke-static {p0, p1}, Ld7/l;->h(Lkotlin/jvm/internal/E;Landroid/content/DialogInterface;)V

    return-void
.end method
