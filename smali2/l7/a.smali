.class public final synthetic Ll7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/D0$a;


# instance fields
.field public final synthetic a:Ll7/k;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll7/k;Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/a;->a:Ll7/k;

    iput-object p2, p0, Ll7/a;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Landroid/content/Intent;)V
    .registers 4

    iget-object v0, p0, Ll7/a;->a:Ll7/k;

    iget-object p0, p0, Ll7/a;->b:Ljava/lang/Runnable;

    invoke-static {v0, p0, p1, p2}, Ll7/k;->i0(Ll7/k;Ljava/lang/Runnable;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    return-void
.end method
